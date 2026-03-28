public class MyArrayList implements  MayArrayListTAD {

    ////////////////INSERÇÃO

    public int[] addFirst(int item, int[] list) {

        int[] newList = new int[list.length + 1];

        newList[0] = item;

        for (int i = 1; i < newList.length; i++) {
            newList[i] = list[i -1];
        }

        return newList;
    }

    public int[] addLast(int item, int[] list) {
        int[] newList = new int[list.length + 1];

        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }

        newList[newList.length -1] = item;

        return newList;
    }


    public int[] insertAt(int elementosPreenchidos, int positionElement, int valueElement, int[] list){
        for (int i = elementosPreenchidos; i > positionElement; i--) {
            list[i] = list[i - 1];
        }

        list[positionElement] = valueElement;

        return  list;
    }

    /// //////////////////////////////REMOÇÃO

    //REMOVE POR POSIÇAO ESPECÍFICA
    public int[] deleteItem(int item, int[] list) {
        int[] newList = new int[list.length - 1];

        int j = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] != item) {
                newList[j] = list[i];
                j++;
            }
        }

        return newList;
    }


    public int[] removeFirst(int[] list){
        return deleteItem(list[0], list);
    }

    public int[] removeLast(int[] list){
        return deleteItem(list[list.length -1], list);
    }

    public int[] removeAt(int[] list, int position){
        return deleteItem(list[position], list);
    }



    //////////////////////BUSCA
    public int find(int[] list, int positon){
        return list[positon];
    }

    public int get(int[] list, int positon){
        return list[positon];
    }


    /// ATUALIZAÇÃO
    public int[] set(int item, int position, int[] list) {
        int[] newList = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }
        newList[position] = item;
        return newList;
    }
}
