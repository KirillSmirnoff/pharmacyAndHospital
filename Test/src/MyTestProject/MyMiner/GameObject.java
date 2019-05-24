package MyTestProject.MyMiner;

class GameObject {

    boolean isMine;
    boolean isOpen;
    boolean isFlag;
    int x,y;
    int countMineNeighbors;

    GameObject(boolean isMine, int x, int y) {
        this.isMine = isMine;
        this.x = x;
        this.y = y;
    }
}
