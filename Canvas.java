import java.util.List;

class Canvas {

    List<Point> pointsList;

    Canvas(){}

    Canvas(List<Point> pointsList){
        this.pointsList = pointsList;
    }

    public void addPoint(Point point){
        this.pointsList.add(point);
    }

    public void removePointAt(int index){
        this.pointsList.remove(index);
    }
    
}