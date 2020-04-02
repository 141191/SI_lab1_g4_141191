class Point {
    String id;
    double x,y;

    //TODO add new variable
    String pointColor;
    //TODO constructor
    Point(){}
    Point(String id, double x, double y, String pointColor){
        this.id = id;
        this.x = x;
        this.y = y;
        this.pointColor = pointColor;
    }
    //TODO setters and getters
    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getX(){
        return this.x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getY(){
        return this.y;
    }

    public void setPointColor(String pointColor){
        this.pointColor = pointColor;
    }

    public String getPointColor(){
        return this.pointColor;
    }

    public void move (char xDirection, char yDirection) {
        //TODO
        if(xDirection == 'L'){
            this.x = this.x - 1;
        } else {
            this.x = this.x + 1;
        }
        if(yDirection == 'D'){
            this.y = this.y - 1;
        } else {
            this.y = this.y + 1;
        }
    }

    public void draw () {
        //TODO
        System.out.println("X: " + this.x + " Y: " + this.y);
    }



}