package 课堂代码.数据结构.课件练习.Map和Set;

class HashNode {
    public int key;
    public int value;
    public HashNode next;

    public HashNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

//哈希桶的方式处理哈希冲突
public class MyHashMap {
    private HashNode[] array = new HashNode[16];
    private int size = 0;

    public void put(int key, int value) {
        //计算出的key用数组长度取余得到下标
        //key值不同但是计算出来的index下标可能是相同的.
        int index = key % array.length;
        //在这个位置的链表上寻找是否有相同key
        for (HashNode cur = array[index]; cur != null; cur = cur.next) {
            //如果key值相同直接修改value值就可以
            if (cur.key == key) {
                cur.value = value;
                return;
            }
        }
        //遍历链表发现没有重复的,就使用头插法进行插入新节点
        HashNode newnode = new HashNode(key, value);
        //头插!
        newnode.next = array[index];
        array[index] = newnode;
        size++;

        //负载因子的大小影响着哈希表发生冲突的可能,
        //负载因子设置的越小,对空间的利用率越低.设置的越大,对查询速度的性能影响较大
        if (loadFactor() > 0.75) {
            resize();
        }
    }

    private void resize() {
        HashNode[] newArray = new HashNode[array.length << 1];
        for (int i = 0; i < array.length; i++) {
            HashNode next = null;
            for (HashNode cur = array[i]; cur != null; cur = null) {
                next = cur.next;
                //重新用hash计算下标并头插
                int indexNew = cur.key % newArray.length;
                cur.next = newArray[indexNew];
                newArray[indexNew] = cur;
            }
        }
    }

    private double loadFactor() {
        return (double) size / array.length;
    }

    public Integer get(int key) {
        int index = key % array.length;
        for (HashNode cur = array[index]; cur != null; cur = cur.next) {
            if (cur.key == key) {
                return cur.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
