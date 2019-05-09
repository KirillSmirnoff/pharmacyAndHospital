package MyMiner;

class GameObject {

    boolean isMine;
    boolean isOpen;
    public int x,y;
    int countMineNeighbors;

    public GameObject(boolean isMine, int x, int y) {
        this.isMine = isMine;
        this.x = x;
        this.y = y;
    }

}
