package Array_dataStructure;

public class Dynamic_array {
    private int [] items;
    int count;

    public Dynamic_array(int length){
        items = new int[length];
    }

    public void insert(int item){
        if(count == items.length){
            int[] newItems = new int[count * 2];

            for(int i = 0; i < count; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items [count++] = item;
    }

    public void removeAt(int index){
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        for(int i = index; i < count; i++){
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item){
        for(int i = 0; i < count; i++){
            if(item == items[i]) {
                return i;
            }
        }
        return -1;
    }

    public void print(){
        for(int i = 0; i < count; i++){
            //if there is no element in the array it will not print anything as our count is 0.
            //As we insert the element the count value will increase and this method will print the element.
            System.out.println(items[i]);
        }
    }

}
