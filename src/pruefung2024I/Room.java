package pruefung2024I;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Room {
    private String name;
    private boolean minotaur = false;
    private Set<Room> rechable = new HashSet<Room>();

    public Room(String name) {
        this.name = name;
    }

    public boolean hasMinotaur(){
        return minotaur;
    }

    public void setMinotaur(boolean v){
        this.minotaur = v;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Room> getReachable(){
        return rechable;
    }

    public void addReachable(Room room){
        rechable.add(room);
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        if (Objects.equals(name, room.name)){
            return true;
        }
        return false;
    }

}
