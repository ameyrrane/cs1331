public class StringOperations {
    
    public static void main(String[] args) {
        
        String name = "David";

        System.out.println("Your name is " + name);

        String newName;

        newName = "A" + name.substring(1, name.length()) + "Z";

        System.out.println("Your new name is " + newName);

        String url = "www.gatech.edu";

        System.out.println("Your url is " + url);

        int startIndex = url.indexOf(".") + 1;

        int endIndex = url.lastIndexOf(".");

        String urlName = url.substring(startIndex, endIndex);

        System.out.println("Main name of your url is " + urlName);
    }
}
