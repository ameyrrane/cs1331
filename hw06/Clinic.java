import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Clinic {
    private File patientFile;
    private int day;

    public Clinic(File file) {
        this.patientFile = file;
        this.day = 1;
    }

    public Clinic(String fileName) {
        this(new File(fileName));
    }

    public String nextDay(File f) throws FileNotFoundException, InvalidPetException{
        this.day++;
        Scanner fileScanner = new Scanner(f);
        String patientInfo = "";
        String line = null;
        while (fileScanner.hasNextLine()) {
            line = fileScanner.nextLine();
            String[] appointmentInfo = line.split(",");
            String name = appointmentInfo[0];
            String typeOfPet = appointmentInfo[1];
            String number = appointmentInfo[2];
            String timeIn = appointmentInfo[3];

            
            //If type of pet is not valid. throw exception.
            if (!typeOfPet.equals("Cat") && !typeOfPet.equals("Dog")) {
                throw new InvalidPetException();
            }

            Scanner input = new Scanner(System.in);
            System.out.printf("Consultation for %s the %s at %s.\n", name, typeOfPet, timeIn);
            
            
            // Get user input for health and painLevel
            boolean validHealthEntry = false;
            boolean validPainLevelEntry = false;
            double initialHealth = 0;
            int initialPainLevel = 1;
            Pet pet;
            
            while(!validHealthEntry) {
                try {
                System.out.printf("What is the health of %s?\n", name);
                initialHealth = input.nextDouble();
                validHealthEntry = true;
                } catch (InputMismatchException ime) {
                    System.out.println("Please enter a number");
                } finally {
                    input.nextLine();
                }
            }

            while(!validPainLevelEntry) {
                try {
                System.out.printf("On a scale of 1 to 10, how much pain is %s in right now?\n", name);
                initialPainLevel = input.nextInt();
                validPainLevelEntry = true;
                } catch (InputMismatchException ime) {
                    System.out.println("Please enter a number");
                } finally {
                    input.nextLine();
                }
            }
            
            if (typeOfPet.equals("Cat")) {
                int miceCaught = Integer.parseInt(number);
                pet = new Cat(name, initialHealth, initialPainLevel, miceCaught);
            } else {
                double droolRate = Double.parseDouble(number);
                pet = new Dog(name, initialHealth, initialPainLevel, droolRate);
            }
            pet.speak();
            int treatmentTime = pet.treat();
            String timeOut = addTime(timeIn, treatmentTime);
            String patientLine = String.format("%s,%s,%s,Day %d,%s,%s,%f,%d\n", name, typeOfPet, number, this.day,timeIn,timeOut, initialHealth, initialPainLevel);
            patientInfo += patientLine;
        }
        fileScanner.close();
        
        return patientInfo;
    }

    public String nextDay(String fileName) throws FileNotFoundException{
        return this.nextDay(new File(fileName));
        
    }

    public boolean addToFile(String patientInfo) {
        Scanner fileScanner = null;
        PrintWriter filePrinter = null;
        String name;
        String appointmentInfo;
        String toPrint = "";
        boolean added = false;
        
        try (Scanner lineScanner = new Scanner(patientInfo)) {
            lineScanner.useDelimiter(",");
            name = lineScanner.next();
            lineScanner.next();
            lineScanner.next();
            appointmentInfo = lineScanner.nextLine();
        } catch (Exception e) {
            return false;
        }


        try {
            fileScanner = new Scanner(patientFile);
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.startsWith(name)) {
                    line += appointmentInfo;
                    added = true;
                }
                toPrint += line + "\n";                
            }
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error: " + fnfe.getMessage());
            return false;
        } finally {
            if(fileScanner != null) {
                fileScanner.close();
            }
        }

        if(!added) {
            toPrint += patientInfo;
        }

        try {
            filePrinter = new PrintWriter(patientFile);
            filePrinter.print(toPrint); 
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error: " + fnfe.getMessage());
            return false;
        } finally {
            if(filePrinter != null) {
                filePrinter.close();
            }
        }

        
        return true;
    }

    private static String addTime(String timeIn, int treatmentTime) {
        int time = Integer.parseInt(timeIn);
        int hour = time / 100;
        int min = time % 100;

        min = min + treatmentTime;

        int addedhour = min / 60;
        min %= 60;
        
        if (hour + addedhour > 24) {
            hour = 0;
        }
        
        return String.format("%02d%02d", hour, min);
    }


}
