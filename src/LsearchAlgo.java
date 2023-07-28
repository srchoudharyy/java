/* Actually sometimes we have to search an item through list of Items
*  For E.g. We have to search a particular int num in list(Array) of Integers
*     (or)  May be we have to search for a string in list of Strings
*  To search Number (say Target-t) in an Array(of Large Numbers), we are going to use algorithms(methods)
*  Search Algorithms -    i] Linear Search Algo
*                        ii] Binary Search Algo
*                            - ceiling/Floor of num (or) string
*                            - First&Last Position in sorted array (or) Infinite array
*                            - Peak index in mountain array
*                            - search in mountain Array
*                            - peak point of rotated Array.
*                            - search in rotated Array with duplicate values.
*                            - VVP split array largest sum
*                       iii] Binary Search in 2D array
*  //Don't worry we will learn this by integrating small-small details*/

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LsearchAlgo {
    public static void main(String[] args) {
//        int[] feededArray = new int[10];  // it's normal to take particular length array, I have to see user's choice size Array
        Scanner input = new Scanner(System.in);

//        /* bellow code for Normal Binary Search*/
//        ArrayList<Integer> feededArray = new ArrayList<>();
//        System.out.println("Enter Numbers to feed in Array in ascending order (&) enter x when you are done with feeding - ");
//        String num = input.next();
//        // Taking input of Array until user enters x
//        while (!(num.equals("x"))) {
//            feededArray.add(Integer.parseInt(num));
//            num = input.next();
//        }
//        System.out.println("Enter target to search - ");
//        // Taking target input to search through out array + calling binarysearchalgo which return target location
//        int target = input.nextInt(), targetlocation = binsearch.binaryAlgo(feededArray, target);
//
//        if (targetlocation != -1) System.out.println("Target present at -> " + targetlocation);
//        else System.out.println("Target " + target + " not present in Array");
//
//
//        /*below code for Floor & ceil of target in that Array*/
//        System.out.println("Enter \"yes\" if you want Ceil & Floor num or target ");
//        String response1 = input.next();
//        if ((response1.equals("yes")) || (response1.equals("Yes")) || (response1.equals("YES")) || (response1.equals(("y")))) {
//            binsearch.floorCeilAlgo(feededArray, target);  // Calls Floorceil algo of binsearch Class
//        }
//
//
//        /*below code for finding range(position or index points) of repeated number in Array*/
//        System.out.println("Enter \"yes\" if you want the range of that target, in which it's repeated ");
//        String response2 = input.next();
//        if ((response2.equals("yes")) || (response2.equals("Yes")) || (response2.equals("YES")) || (response2.equals(("y")))) {
//            binsearch.positionofTarget(feededArray, target);  // By this method we get to know range of index of target, that much it's repeated.
//        }
//
//
//        /*below code for getting peak point of Mountain Array*/
//        ArrayList<Integer> feededArray2 = new ArrayList<>();
//        System.out.println("Enter Numbers to feed in Array in Mountain order (&) enter x when you are done with feeding - ");
//        String no = input.next();
//        // Taking input of Array until user enters x
//        while (!(no.equals("x"))) {
//            feededArray2.add(Integer.parseInt(no));
//            no = input.next();
//        }
//        System.out.println("Peak Point of these Mountain array- "+feededArray2+" is "+feededArray2.get(binsearch.peakptinMountainarray(feededArray2)));
//        System.out.println("Enter \"yes\" if you want to search any num in this Mountain Array ");
//        String response3 = input.next();
//        if ((response3.equals("yes")) || (response3.equals("Yes")) || (response3.equals("YES")) || (response3.equals(("y")))) {
//            System.out.println("Enter target Numberr- ");
//            int target2= input.nextInt();
//            binsearch.searchinMountainarray(feededArray2,target2);
//        }
//
//
//
//        /*below code for getting pivot point of Rotated Array*/
//        ArrayList<Integer> feededArray3 = new ArrayList<>();
//        System.out.println("Enter Numbers to feed in Array in Rotated order (&) enter x when you are done with feeding - ");
//        String no2 = input.next();
//        // Taking input of Array until user enters x
//        while (!(no2.equals("x"))) {
//            feededArray3.add(Integer.parseInt(no2));
//            no2 = input.next();
//        }
//        System.out.println("Pivot Point of these Rotated array- "+feededArray3+" is "+feededArray3.get(binsearch.pivotptofRotatedarray(feededArray3)));
//
//
//
//        /*below code for getting minimum Largest sum of sub-arrays among all possible cases*/
//        ArrayList<Integer> feededarray4 = new ArrayList<>();
//        System.out.println("Enter Numbers to feed in Array (&) enter x when you are done with feeding - ");
//        String no3 = input.next();
//        // Taking input of Array until user enters x
//        while (!(no3.equals("x"))) {
//            feededarray4.add(Integer.parseInt(no3));
//            no3 = input.next();
//        }
//        System.out.println("Enter No. of partition (or) No. of sub-arrays in which you want to search for minimum Largest sum- ");
//        int M= input.nextInt();
//        System.out.println("Minimum Largest sum among all these cases is- "+binsearch.minimumLargsumamongallCases(feededarray4,M));


        /*below code for search in 2D array- Note- 2D array must be row wise as well as column wise sorted for Binary search*/
//        int[][] array_2d= new int[2][3];              //It can be used.
//        int[][] array_2d= {{1,2,3,4},{5,6,7,8}};      //It can also be used.
        ArrayList<ArrayList<Integer>> arraylist_2d= new ArrayList<ArrayList<Integer>>();
        System.out.println("It takes input in 2D array, So enter your numbers for 1st row (&) when you are done enter \"x\"- ");
        String no4= input.next();

        int i=0;
        while (!(no4.equals("x"))) {
            arraylist_2d.add(new ArrayList<Integer>());
            while (!(no4.equals("x"))) {
                arraylist_2d.get(i).add(Integer.parseInt(no4)); //Note here IMP- we used arraylist_2d.get(i)-which gives us the arraylist object reference via which we are adding Integer to that object
                no4= input.next();
            }
            no4= input.next();
            i++;
        }

        System.out.println(arraylist_2d);
        System.out.println("Enter Target to search in this 2D array- ");
        int targetof2D= input.nextInt();
        if (binsearch.binsearchin2Darray(arraylist_2d,targetof2D)==null) System.out.println("Target now present");
        else System.out.println("Target present at [ith row, jth index]- "+binsearch.binsearchin2Darray(arraylist_2d,targetof2D));




    }
}

    class binsearch {  // This class conatins simple binary search algo + 5 binary imp concepts.

        static int binaryAlgo(ArrayList<Integer> feededArray, int target) {  // Simple Binary search function
            int s = 0, e = feededArray.size() - 1, mid = e / 2; // VVP as Array follows index system( starts from 0,1,..) So our e i.e index of last num in array should be of (array_size - 1)
            while (s <= e) {
                if (feededArray.get(mid) < target) {  // VVP- here target > midterm means that it's not equal to midterm, so there is no sense of setting s=midterm instead of that set s=midterm+1.
                    s = mid + 1;
                    mid = (s + e) / 2;
                } else if (target < feededArray.get(mid)) {
                    e = mid - 1;
                    mid = (s + e) / 2;
                } else return mid;
            }
            return -1;
        }
        /* In short if I have to say Algo of Binary Search-
         *     Keep this point in mind i) Arr indexs = [ s=0, .........m=s+e/2........., e=arr.length-1 ]
         *                            ii) while comparing target( t < (or) > arr[m] ) you already checked for that index m, thus don't consider m in upgradation i.e s = m+1(not s=m) & e = m-1(not e=m)
         *                           iii) Apply while loop for s<=e (not s<e), because think about the case when algo reached at it's last iteration (when s=e=m), where we judge wheather target present or not.
         *     Algo structure is as follows -
         *   -->  int s=0, e=arr.length()-1, m=(e+s)/2;
         *        while(s<=e){
         *            if ( arr[m] < tar ) s=m+1, m=s+e/2;
         *            else if ( tar < arr[m] ) e=m-1, m=s+e/2;
         *            else return m;
         *        }   return -1;
         *       }*/



        static void floorCeilAlgo(ArrayList<Integer> feededArray, int target) { //Ceiling & Flooring of target given for an Array
            int s = 0, e = feededArray.size() - 1, m = (e + s) / 2;
            int[] range = {-1, -1};
            while (s <= e) {
                if (feededArray.get(m) < target) {
                    s = m + 1;
                    m = (e + s) / 2;
                } else if (target < feededArray.get(m)) {
                    e = m - 1;
                    m = (e + s) / 2;
                } else {
                    range[0] = -1;
                    range[1] = -1;
                    break;
                } //it will hit's when target founds
                range[0] = s;
                range[1] = e;
            }
            if ((range[0] == -1) && (range[1] == -1))
                System.out.println("Ceil & Floor is that No. itself- " + target); //Case-1: Num is present
            else if ((-1 < e) && (s < feededArray.size())) { //Case-2: When target not present but in range of Array i.e [..,..,..,t,..,..,..,..]
                System.out.println("Floor of " + target + " - " + feededArray.get(e));
                System.out.println("Ceil of " + target + " - " + feededArray.get(s));
            } else if ((s == feededArray.size()) && (e == feededArray.size() - 1)) {
                System.out.println("Floor of " + target + " - " + feededArray.get(e));
                System.out.println("Ceil out of bound of Array");
            } else {
                System.out.println("Floor out of bound of Array");
                System.out.println("Ceil of " + target + " - " + feededArray.get(s));
            }
        }

        static void positionofTarget(ArrayList<Integer> feededarray, int target) { //this function giver position(index) of repeated number in Array
            boolean targetconfirmation = false;
            int s=0, e=feededarray.size()-1, m=(s+e)/2, sp = -1, lp = -1; // sp-starting positon ,lp-last position of target in Array
            while (s <= e) {
                if (feededarray.get(m) < target) {
                    s = m + 1;
                    m = (s + e) / 2;
                } else if (target < feededarray.get(m)) {
                    e = m - 1;
                    m = (s + e) / 2;
                } else {
                    sp = m;
                    lp = m;
                    targetconfirmation = true;
                    break;
                }
            }
            if (targetconfirmation) {
                while( feededarray.get(sp)==target ){
                    sp--;
                    if (sp<0) break;
                }
                while ( feededarray.get(lp)==target){
                    lp++;
                    if (lp>= feededarray.size()) break;
                }
                System.out.println(target + " starts from index- " + (sp+1) + " to index- " + (lp-1));
            } else System.out.println("Target is not present");
        }

        static int peakptinMountainarray(ArrayList<Integer> feededarray) { // these method finds peak point in Mountain Array-{1,2,3,4,5,6,5,4,3}
            int s=0, e= feededarray.size()-1, m=(e+s)/2;
            while(s<e){
                if(feededarray.get(m)< feededarray.get(m+1)) { s=m+1; m=(e+s)/2; }
                else if (feededarray.get(m)> feededarray.get(m+1)) { e=m; m=(e+s)/2; }
                else break;
            }
            return m;
        }


        static void searchinMountainarray(ArrayList<Integer> feededarray, int target){ // Here Array breaked in 2 arrays by peak point-> one ascending one & second descending one
            int peakpt=binsearch.peakptinMountainarray(feededarray), s=0, e=peakpt, m=(e+s)/2;
            int[] targetloc={-1,-1};
            // runs for 1st part of Mountain array
            while(s<=e){
                    if (feededarray.get(m)<target) { s=m+1; m=(e+s)/2;}
                    else if (feededarray.get(m)>target) { e=m-1; m=(e+s)/2;}
                    else { targetloc[0]=m; break;}
            }

            // runs for 2nd part of Mountain array
            s=peakpt+1;
            e=feededarray.size()-1;
            m=(e+s)/2;
            while(s<=e){  // Here our array becomes descending so, we inverted the signs of if-else-if conditions VVP
                    if (feededarray.get(m)>target) { s=m+1; m=(e+s)/2;}
                    else if (feededarray.get(m)<target) { e=m-1; m=(e+s)/2;}
                    else { targetloc[1]=m; break;}
            }

            if (targetloc[0]!=-1) {
                System.out.println("Target present at- "+targetloc[0]);
                if (targetloc[1]!=-1) System.out.println("Target also present at- "+targetloc[1]);
            }
            else System.out.println("Target not present");
        }


        static int pivotptofRotatedarray(ArrayList<Integer> feededarray){ // gives pivot pt of rotated array
            int s=0, e= feededarray.size()-1, m=(e+s)/2;
            while(s<=e){
                if (feededarray.get(s)<feededarray.get(m)) { s=m; m=(e+s)/2; }
                else if (feededarray.get(s)>feededarray.get(m)) { e=m; m=(e+s)/2; }
                else {
                    if (feededarray.get(s)<feededarray.get(e)) return e; //if user enters simple ascending array- {1,2,3,4,5,6}
                    else return s; //s i.e pivot point of our rotated array
                }
            }
            return -1;
        }


        /*Split-array Largest Sum
        * E.g- Given an Array with non-negative integers, and positive value d (no. of distributions). You have to divide the array in d no. of sub-arrays, array should be continous and each sub-array must have one value. Find the minimum Largest sum among all the cases.
        * alternative E.g- Given N no. of books, every i(th) no of book has Ai no of pages, you have to distribute these books to M students.
        *                  Find the sum of pages, which is Largest among all the M students and these largest sum is smaller Largest sum among all the cases.
        *
        * */


        static int minimumLargsumamongallCases(ArrayList<Integer> array,int M) { //M is no. of sub-array in which we can split our array to get, minimul Largest sum among all the possible cases.
            int arraysum = 0, largestofarray = 0, ans=0;
            for (int num: array) { arraysum+=num; } // this loop gives sum of all elements of array.
            for (int i = 0; i < array.size() - 1; i++) {  // this loop gives largest num among array.
                if (array.get(i) < array.get(i + 1)) largestofarray = array.get(i + 1);
                else largestofarray = array.get(i);
            }

            int s=largestofarray, e=arraysum; // j is number of subarray used to checking in loop
            while (s<=e) {
                int j=1, mid=(e+s)/2, subarraysum=0;
                for (int num: array ) {
                    if ( (subarraysum+num)<= mid) subarraysum+=num;
                    else {
                        subarraysum=num;
                        j++;
                    }
                }
                if (j>M) s=mid+1; //we have to increase load(ans) by changing s of range above mid.
                else if (j<M) e=mid-1; //we have to decrease load(ans) by getting e of range below mid.
                else {
                    e=mid-1;
                    ans=mid;
                }
            }
            return ans;
        }



        static ArrayList<ArrayList<Integer>> binsearchin2Darray(ArrayList<ArrayList<Integer>> arr_2D, int target){ //here you learn how to apply binary search in 2D array using Arraylist
            int rowno=0, tlrow=0; //tlrow- targetloc array row number
            ArrayList<ArrayList<Integer>> targetloc=new ArrayList<ArrayList<Integer>>();

            for (ArrayList<Integer> row: arr_2D) {
                int s=0, e=arr_2D.get(rowno).size()-1, mid;
                while (s <= e) {
                    mid=(e+s)/2;
                    if (arr_2D.get(rowno).get(mid)<target) s=mid+1;
                    else if (arr_2D.get(rowno).get(mid)>target) e=mid-1;
                    else {
                        targetloc.add(new ArrayList<Integer>());
                        targetloc.get(tlrow).add(rowno);
                        targetloc.get(tlrow).add(mid);
                        tlrow++;
                        break;
                    }
                }
                rowno++;
            }
            return targetloc;
        }
    }


//done





