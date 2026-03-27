public interface MayArrayListTAD {
    int[] addFirst(int item, int[] list);
    int[] addLast(int item, int[] list);
    int[] insertAt(int elementosPreenchidos, int positionElement, int valueElement, int[] list);
    int[] deleteItem(int item, int[] list);
    int[] removeFirst(int[] list);
    int[] removeLast(int[] list);
    int[] removeAt(int[] list, int position);
    int find(int[] list, int positon);
    int get(int[] list, int positon);
    int[] set(int item, int position, int[] list);
}
