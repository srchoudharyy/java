import java.util.ArrayList;
import java.util.Scanner;

/*Sometimes we have an large array, and We have to do several operations on that array. For these operations it's requisite that our array should be sorted.
* So, To sort array (i.e to make it in particular order- ascending or descending), there are majorly four Algorithms present as follows-
* Sort Algorithms -     i] Bubble Sort/Sinking Sort/Exchange Sort
*                      ii] Selection Sort
*                     iii] Insertion Sort
*                      iv] Cyclic Sort // works only when array have all different numbers and are in range of [1->N] ....N-length of array
* i] Bubble sort- E.g. Arr= [3,1,5,4,2] Here we compare alternative nums of array & place largest one to the last index of array
*    Arr=>[3,1,5,4,2] => [1,3,5,4,2] => [1,3,4,5,2] => [1,3,4,2,5] Now again do same, Here N-1 checks done, after that N-2, then N-3 these checks are done
* ... for further algorithms deatils refer my notes.*/
public class Lsortingalgo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*below code for bubble sort */
        ArrayList<Integer> bubblearray = new ArrayList<>();
        System.out.println("For Bubble Sort: Enter \"yes \" to feed number in array- ");
        String bubblearrayobjects = input.next();
        if ((bubblearrayobjects.equals("yes")) || (bubblearrayobjects.equals("Yes") || (bubblearrayobjects.equals("YES")) || (bubblearrayobjects.equals("y")) || (bubblearrayobjects.equals("Y")))) {
            System.out.println("Enter number ot feed in array (&) then enter \"x\" when you are done with feeding- ");
            bubblearrayobjects = input.next();
            while (!(bubblearrayobjects.equals("x"))) {
                bubblearray.add(Integer.parseInt(bubblearrayobjects));
                bubblearrayobjects = input.next();
            }
            System.out.println(sortingalgo.bubblesort(bubblearray));
        }


        /*below code for selection sort*/
        ArrayList<Integer> selectionarray = new ArrayList<>();
        System.out.println("For Selection Sort: Enter \"yes \" to feed number in array- ");
        String selectionarrayobjects = input.next();
        if ((selectionarrayobjects.equals("yes")) || (selectionarrayobjects.equals("Yes") || (selectionarrayobjects.equals("YES")) || (selectionarrayobjects.equals("y")) || (selectionarrayobjects.equals("Y")))) {
            System.out.println("Enter number ot feed in array (&) then enter \"x\" when you are done with feeding- ");
            selectionarrayobjects = input.next();
            while (!(selectionarrayobjects.equals("x"))) {
                selectionarray.add(Integer.parseInt(selectionarrayobjects));
                selectionarrayobjects = input.next();
            }
            System.out.println(sortingalgo.selectionsort(selectionarray));
        }


        /*below code for insertion sort*/
        ArrayList<Integer> insertionarray = new ArrayList<>();
        System.out.println("For Insertion Sort: Enter \"yes\" to feed numbers in array- ");
        String insertionarrayobjects = input.next();
        if ((insertionarrayobjects.equals("yes")) || (insertionarrayobjects.equals("Yes") || (insertionarrayobjects.equals("YES")) || (insertionarrayobjects.equals("y")) || (insertionarrayobjects.equals("Y")))) {
            System.out.println("Enter numbers to feed in array (&) then enter \"x\" when your are done with feeding- ");
            insertionarrayobjects = input.next();
            while (!(insertionarrayobjects.equals("x"))) {
                insertionarray.add(Integer.parseInt(insertionarrayobjects));
                insertionarrayobjects = input.next();
            }
            System.out.println(sortingalgo.insertionsort(insertionarray));
        }


        ArrayList<Integer> cyclicarray = new ArrayList<>();
        System.out.println("For Cyclic Sort: Enter \"yes\" to feed numbers in array- ");
        String cyclicsortobjects= input.next();
        if ((cyclicsortobjects.equals("yes")) || (cyclicsortobjects.equals("Yes") || (cyclicsortobjects.equals("YES")) || cyclicsortobjects.equals("y")) || (cyclicsortobjects.equals("Y"))) {
            System.out.println("Enter numbers from 1 to N, don't repeat any number (&) enter \"x\" when you are done with feeding- ");
            cyclicsortobjects= input.next();
            while (!(cyclicsortobjects.equals("x"))){
                cyclicarray.add(Integer.parseInt(cyclicsortobjects));
                cyclicsortobjects= input.next();
            }
            System.out.println(sortingalgo.cyclicsort(cyclicarray));
        }
    }
}

class sortingalgo {

        /*Although bubble sort algo is simple algorithm, but it's UNSTABLE algorithm in sorting*/
        static ArrayList<Integer> bubblesort(ArrayList<Integer> bubblearray) { // Bubble sort algorithm works by placing largest num at last position. {2 for loops used}
            int temp;
            for (int i = 0; i < bubblearray.size(); i++) {
                for (int j = 0; j < bubblearray.size() - i - 1; j++) { // by these largest num of array automatically get to last point of array.
                    if (bubblearray.get(j) > bubblearray.get(j + 1)) {
                        temp = bubblearray.get(j + 1);
                        bubblearray.set(j + 1, bubblearray.get(j));
                        bubblearray.set(j, temp);
                    }
                }
            }

            return bubblearray;
        }

        // selection sort also UNSTABLE algorithm in sorting manner.
        static ArrayList<Integer> selectionsort(ArrayList<Integer> selectionarray){ // Selection sort structure is as find largest among array and then place to last position of array, then find 2nd largest among array then place it to 2nd last position of array...and so on.........
            int  temp, loc=0, arr_size= selectionarray.size();
            for (int i = 0; i < arr_size; i++) {
                int larger=0;
                for (int j = 0; j < arr_size-i; j++) { // finds larger among array
                    if ( larger <= selectionarray.get(j)) { larger=selectionarray.get(j); loc=j; }
                }
                // below statement swipe the value of larger one and last one position of array
                temp=selectionarray.get(arr_size-i-1);
                selectionarray.set((arr_size-i-1), larger);
                selectionarray.set(loc,temp);
            }
            return selectionarray;
        }


        // Insertion sort is simple and STABLE algorithm in sorting manner
        static ArrayList<Integer> insertionsort(ArrayList<Integer> insertionarray){ // Insertion base on taking 1 size array and compare with it to 2nd position(if yes then swap them), then taking 2 size array comparing both 2 elements to 3rd position(if yes swap them), and so on.....          Insertionsort is best and simple sorting algorithm, also it's stable algorithm in sorting,
            int arr_size= insertionarray.size();
            for (int i = 0; i < arr_size-1 ; i++) {
                for (int j = 0; j < i+1; j++) {
                    if (insertionarray.get(j)>insertionarray.get(i+1)) swap(insertionarray,j,i+1);
                }
            }
            return insertionarray;
        }

        static void swap(ArrayList<Integer> array, int i, int j){
            int temp= array.get(j);
            array.set(j,array.get(i));
            array.set(i,temp);
        }


        static ArrayList<Integer> cyclicsort(ArrayList<Integer> cyclicarray){
            int arr_size=cyclicarray.size();
            for (int i = 0; i < arr_size; i++) {
                if (cyclicarray.get(i)!=(i+1)) {
                    cyclicarray.set(cyclicarray.get(i)-1,cyclicarray.get(i));
                    cyclicarray.set(i,i+1);
                }
            }
            return cyclicarray;
        }
}

//done .. also pushed this repo to my github repo's..



