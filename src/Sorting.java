public class Sorting {
    public static void main(String[] args){
        //Testing out the bubble sort to the console
        int[] arraySortBubble = {18, 35, 32, 8, 22, 1, 27};
        bubbleSort(arraySortBubble);
        for (int num : arraySortBubble) {
            System.out.println(num);
        }

        //Testing out the quick sort to the console
        int[] arraySortQuick = {18, 35, 32, 8, 22, 39, 7};
        quickSort(arraySortQuick);
        for (int num : arraySortQuick) {
            System.out.println(num);
        }

        //Testing out the binary search to the console
        int[] arraySearch = {2, 5, 7, 8, 10, 12, 15};
        System.out.println(binarySearch(arraySearch, 10));
    }

    public static int[] bubbleSort(int[] inputArray){
        for(int i=0; i<inputArray.length; i++){
            for(int j=i+1; j<inputArray.length; j++){
                if(inputArray[i] > inputArray[j]){
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        return inputArray;
    }

    public static int[] quickSort(int[] inputArray){
        int temp = 0;
        int pointerLow = 0;
        int pointerHigh = inputArray.length - 1;
        int i = -1;
        int pivot = inputArray[pointerHigh];

        while (pointerLow < pointerHigh) {
            for (int j = pointerLow; j < inputArray.length; j++) {
                if (inputArray[j] <= pivot) {
                    i++;
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
            pointerHigh--;
            pointerLow++;
        }
        return inputArray;
    }

    public static int binarySearch(int[] inputArray, int search){
        int index = -1; //Return -1 if the search number is not in array
        boolean complete = false;
        int pointerLow = 0; //Pointer for the lowest part of the array
        int pointerHigh = inputArray.length-1; //Pointer for the largest part of the array

        while(!complete){
            int pointer = (pointerLow + pointerHigh) / 2; //This is where we are pointing
            if(inputArray[pointer] < search){
                pointerLow = pointer + 1;
            } else if(inputArray[pointer] > search){
                pointerHigh = pointer - 1;
            } else{
                index = pointer;
                complete = true;
            }
        }
        return index;
    }
}
