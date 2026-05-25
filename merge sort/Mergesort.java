import java.util.Arrays;

public class Mergesort{
    public static void main(String[] args) {
        int arr[] = {6,4,2,1,8,3};
        // System.out.println(Arrays.toString(mergesort(arr)));
        mergesortinplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static int [] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int [] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] left, int[] right){
        int [] arr = new int[left.length+right.length];
        int a = 0;
        int b = 0;
        int k = 0;
        while (a<=left.length-1&&b<=right.length-1) {
            if(left[a]<right[b]){
                arr[k] = left[a];
                a++;
            }else{
                arr[k] = right[b];
                b++;
            }
            k++;
        }
        while (a<left.length) {
            arr[k] = left[a];
            a++;
            k++;
        }
        while (b<right.length) {
            arr[k] = right[b];
            b++;
            k++;
        }
        return arr;
    }
    static void mergesortinplace(int[] arr, int s, int e){
        if(e-s==1){
            return;
        }
        int mid = s+(e-s)/2;
        mergesortinplace(arr,s,mid);
        mergesortinplace(arr, mid,e);
        mergeinplace(arr, s,mid,e);
    }
    static void mergeinplace(int[] arr, int s, int mid, int e){
        int [] mix = new int[e-s];
        int a = s;
        int b = mid;
        int k = 0;
        while (a<mid&&b<e) {
            if(arr[a]<arr[b]){
                mix[k] = arr[a];
                a++;
            }else{
                mix[k] = arr[b];
                b++;
            }
            k++;
        }
        while (a<mid) {
            mix[k] = arr[a];
            a++;
            k++;
        }
        while (b<e) {
            mix[k] = arr[b];
            b++;
            k++;
        }
        for(int l = 0;l<mix.length;l++){
            arr[s+l]= mix[l];
        }
    }

    // static void mergesortinplace(int[] arr,int s, int e){
    //     if(e-s==1){
    //         return;
    //     }
    //     int mid = (s+e)/2;
    //     mergesortinplace(arr, s,mid);//it will include elements till arr[0] to arr[mid-1]
    //     mergesortinplace(arr, mid,e);//it will include elements till arr[mid] to arr of length -1
    //     mergeinplace(arr,s,mid,e);
    // }
    // static void mergeinplace(int[] arr, int s,int mid, int e){
    //     int i = s;
    //     int j = mid;
    //     int k = 0;
        
    //     int[] third = new int[e-s];
    //     while (i<mid && j<e) {
    //         if(arr[i]<arr[j]){
    //             third[k]= arr[i];
    //             i++;
    //         }
    //         else{
    //             third[k] = arr[j];
    //             j++;
    //         }
    //         k++;
    //     }
    //     while (i<mid) {
    //         third[k]=arr[i];
    //         i++;
    //         k++;
    //     }
    //     while (j<e) {
    //         third[k]=arr[j];
    //         j++;
    //         k++;
    //     }
    //     for(int l = 0;l<third.length;l++){
    //         arr[s+l]=third[l];
    //     }
    // }
}