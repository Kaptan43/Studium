package pruefung2024I;

import java.util.*;

public class AriadneIterator implements Iterator<Room> {

    private Room entry;
    private Set<Room> visited = new HashSet<>();
    private Stack<Room> ariadnesThread = new Stack<>();
    private boolean flag;
    private Room current;

    public AriadneIterator(Room entry){
        this.entry = entry;
        this.current = entry;
        ariadnesThread.push(entry);
        visited.add(entry);
    }

    @Override
    public boolean hasNext(){
        while(!flag){
            for(Room room : ariadnesThread.peek().getReachable()){
                if(!visited.contains(room)){
                    flag = true;
                    visited.add(ariadnesThread.peek());
                    ariadnesThread.push(room);
                    return  true;
                }
            }
            return  false;
        }
        return flag;
    }

    @Override
    public Room next(){
        if(!hasNext()){
            throw new NoSuchElementException("There is no more rooms in this iterator");
        }
        flag = false;
        return ariadnesThread.peek();
    }

    public void nextForward(){

    }

    public void stepSeeking(){

    }

    public void stepRetreating(){
        ariadnesThread.pop();
    }

    public boolean hasMinotaur(){
        if(ariadnesThread.peek().hasMinotaur()){
            return true;
        }
        return false;

        //return current.hasMinotaur();
    }

    public void step(){

    }

    public void intit(){

    }


}
