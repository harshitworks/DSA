package com.harshit.HashMaps;

import javax.swing.text.html.parser.Entity;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapusingLinkedlist<K,V> {
    ArrayList<LinkedList<Entity>> list;

    private int size = 0 ;
    private float lf = 0.5f;

    public HashMapusingLinkedlist() {
        list = new ArrayList<>();
        for(int i = 0 ; i < 10 ; i++) {
            list.add(new LinkedList<>());
        }
    }

    private class Entity {
        K key ;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(K key , V value) {
        int hash = Math.abs(key.hashCode()) % list.size();
        LinkedList<Entity> entities = list.get(hash);

        for(Entity entity: entities) {
            if(entity.key.equals(key)) {
                entity.value = value;
                return;
            }
        }
        if(size/list.size() >lf ){
            reHash();

        }
        entities.add(new Entity(key, value));
        size++;
    }
    public V get(K key) {
        int hash = Math.abs(key.hashCode()) % list.size();
        LinkedList<Entity> entities = list.get(hash);
        for(Entity entity : entities) {
            if(entity.key.equals(key)) {
                return entity.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int hash  = Math.abs(key.hashCode()) % list.size();
        LinkedList<Entity> entities = list.get(hash);
        for(Entity entity : entities) {
            if(entity.key.equals(key)) {
                entities.remove(entity);
                size--;
                return;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0 ; i < list.size() ; i++) {
            for(Entity entity : list.get(i)) {
                sb.append(entity.key);
                sb.append(": ");
                sb.append(entity.value);
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    public void reHash() {
        System.out.println("we are rehashing");
        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();
        size = 0 ;
        for(int i = 0 ; i < old.size() ; i++) {
            list.add(new LinkedList<>());
        }
        for(LinkedList<Entity> entries : old) {
            for(Entity entry : entries) {
                put(entry.key, entry.value);
            }
        }
    }



}
