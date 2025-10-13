//Write a program to display your college name character by character.
public class DispplyCollageName {

    public static void main(String[] args) {
        String collegeName = "Shree Aurobindo Institute of Technology indore Madhya Pradesh";
        // Display each character of the college name
        for (int i = 0; i < collegeName.length(); i++) {
            System.out.println(collegeName.charAt(i));
        }
    }
}