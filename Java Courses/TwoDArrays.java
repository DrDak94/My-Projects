public class TwoDArrays {
public static void main(String[] args){

    // 2d Array = an Array where each element is another Array.
    // Useful for storing a matrix of Data.



    String[][] groceries = {{"apple", "orange", "banana"}, 
                            {"tomato", "potato", "carrot"},
                            {"beef", "chicken", "pork", "fish"}};

        groceries[0][0] = "pineapple";  // Replace apple with pineapple.
        groceries[1][2] = "celery";     // Replace carrot with celery.
        groceries[2][1] = "eggs";       // Replace chicken with eggs.
        
    

    for(String[] foods : groceries){
        for(String food : foods){
            System.out.print(food + " ");
        }
        System.out.println();
    }
}
}
