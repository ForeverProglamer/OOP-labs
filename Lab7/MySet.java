package lab7;

import com.company.Vegetable;
import java.util.Collection;
import java.util.Set;
import java.util.Arrays;
import java.util.Iterator;

public class MySet<E> implements Set<Vegetable> {
    private int size;
    private double increase = 1.3;
    private Object[] components = new Object[15];

    public MySet() {
    }

    public MySet(Vegetable vegetable) {
        add(vegetable);
    }

    public MySet(Collection<? extends Vegetable> collection) {
        addAll(collection);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i< components.length; i++){
            if (components[i] == o){
                return true;
            }
        }
        return false;
    }
    private void increaseSize(){
        Object[] temporary = components;
        components = new Object[(int)(components.length*increase)];
        size = 0;
        for(Object t:temporary){
            add((Vegetable)t);
        }
    }
    private class MyIterator implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index<lastNotEmpty();
        }

        @Override
        public Object next() {
            while (hasNext()){
                if(components[index] == null) {
                    index++;
                }
                else{
                    return components[index++];
                }
            }
            return null;
        }
    }

    @Override
    public Iterator<Vegetable> iterator() {
        return new MyIterator();
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(components, size);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            return (T[]) Arrays.copyOf(components, size, a.getClass());
        }
        System.arraycopy(components, 0, a, 0, size);
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }



    @Override
    public boolean add(Vegetable e) {
        if (!contains(e)) {
            for (int i = 0; i < components.length; i++) {
                if (components[i] == null) {
                    size++;
                    components[i] = e;
                    return true;
                }
            }
            for (int i = 0; i < components.length; i++) {
                if (components[i] == null) {
                    size++;
                    components[i] = e;
                    return true;
                }
            }
        }
        return false;
    }


    private int lastNotEmpty(){
        int i = components.length-1;
        while (components[i]==null) { i--; }
        return i+1;
    }

    @Override
    public boolean remove(Object o) {
        if(size==0){
            return false;
        }
        for (int i = 0; i < components.length; i++) {
            if (components[i]==o){
                size--;
                components[i]= components[lastNotEmpty()];
                components[lastNotEmpty()]= null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        MyIterator iterator = (MyIterator)c.iterator();
        while (iterator.hasNext()) {
            if (!contains(iterator.next())){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Vegetable> c) {
        boolean isCollectionChanged = false;
        for (Vegetable Vegetable : c) {
            isCollectionChanged |= add(Vegetable);

        }
        increaseSize();
        return isCollectionChanged;
    }




    @Override
    public boolean retainAll(Collection<?> c) {
        boolean flag = false;
        for (Object i: components) {
            if (!c.contains(i)){
                flag |= remove(i);
            }
        }
        return flag;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean flag = false;
        for (Object o:c){
            flag |= remove(o);
        }
        return flag;
    }

    @Override
    public void clear() {
        for (int i = 0; i< components.length; i++){
            components[i] = null;
        }
        size = 0;
    }



}
