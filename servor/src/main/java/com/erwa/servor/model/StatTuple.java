package com.erwa.servor.model;

import javax.persistence.Tuple;
import javax.persistence.TupleElement;
import java.util.List;
import java.util.Objects;

public class StatTuple implements Tuple {
final String key;
int value;

    public StatTuple(String key, int value){
        this.key = key;
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatTuple statTuple = (StatTuple) o;
        return value == statTuple.value && key.equals(statTuple.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public <X> X get(TupleElement<X> tupleElement) {
        return null;
    }

    @Override
    public <X> X get(String s, Class<X> aClass) {
        return null;
    }

    @Override
    public Object get(String s) {
        return null;
    }

    @Override
    public <X> X get(int i, Class<X> aClass) {
        return null;
    }


    //for now, 0 = key, 1 = value
    @Override
    public Object get(int i) {
        return switch (i) {
            case 0 -> this.key;
            case 1 -> this.value;
            default -> this.key;
        };
    }



    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public List<TupleElement<?>> getElements() {
        return null;
    }
}
