import java.util.ArrayList;
public class searchelement {
    public static void main(String[] args) {
        int[] arr = {1,3,5,332,5,4,7,4,43,2};
        System.out.println(ser(arr, 332, 0));
        ser2(arr, 4, 0);
        System.out.println(l);

        // ArrayList<Integer> listt = search5(arr, 4, 0);
        // System.out.println(ispresent(arr,222,0));
        // search3(arr, 4, 0,listt);
        
        // System.out.println(search5(arr, 4, 0));
        // System.out.println(listt);
    }
    static int ser(int [] arr, int target, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }else{
            return ser(arr, target, i+1);
        }
    }
    static ArrayList<Integer> l = new ArrayList<>();
    static void ser2(int[] arr, int target, int i){
        
        if(arr[i]==target){
            l.add(i);
        }
        if(i==arr.length-1){
            return;
        }
        
        ser2(arr, target, i+1);
        
    }












    static int search(int[] arr, int target, int index){
        if(arr[index]==target){
            return index;
        }
        if(index==arr.length-1){
            return -1;
        }
        return search(arr, target, index+1);
    }
    static boolean search4(int[] arr, int target, int index){
        // if(arr[index]==target){
        //     return true;
        // }
        if(index == arr.length){
            return false;
        }
        return arr[index]==target || search4(arr, target, index+1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void search1(int[] arr, int target, int index){
        if(arr[index]==target){
            list.add(index);
        }
        if(index==arr.length-1){
            return;
        }
        search1(arr, target, index+1);
    }

    static ArrayList<Integer> search3(int arr[], int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return search3(arr, target, index+1, list);
    }
    static ArrayList<Integer> search5(int[] arr, int target, int index){
        ArrayList<Integer> l = new ArrayList<>();
        if(arr.length==index){
            return l;
        }
        if(arr[index]==target){
            l.add(index);
        }
        ArrayList<Integer> temp = search5(arr, target, index+1);
        l.addAll(temp);
        return l;
    }
}
