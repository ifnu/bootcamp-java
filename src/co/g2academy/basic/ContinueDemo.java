package co.g2academy.basic;

public class ContinueDemo {

    public static void main(String[] args) {
        String searchText = "peter piper picked a peck of pickled peppers";
        int numberOfPs = 0;

        for(int index = 0; index < searchText.length(); index++){
            //check if char at index index is not equals to 'p' then continue (skip)
            if(searchText.charAt(index) != 'p'){
                continue;
            }

            //increment numberOfPs by one
            numberOfPs++;
        }

        System.out.println("Found " + numberOfPs + " p's in the string.");
    }

}
