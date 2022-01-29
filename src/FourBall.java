import processing.core.PApplet;

public class FourBall extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int number_of_balls = 4;
    public static final int dividing_factor = 5;
    public static final int dia = 10;
    Ball[] Array_ball;

    public static void main(String[] args) {
        PApplet.main("FourBall",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        Array_ball= new Ball[number_of_balls];
        for(int i = 0; i< number_of_balls; i++){
            Array_ball[i]= new Ball(0,HEIGHT*(i+1)/ dividing_factor, dia,i+1);
        }
    }

    @Override
    public void draw() {
        for(int i=0;i< number_of_balls;i++){
            Array_ball[i].draw_circle();
        }
    }
    public class Ball{
        int width;
        int height;
        private final int dia;
        int velocity;

        Ball(int width, int height, int dia, int velocity){
            this.width=width;
            this.height=height;
            this.dia=dia;
            this.velocity=velocity;
        }
        public void draw_circle(){
            ellipse(width,height,dia,dia);
            width+=velocity;
        }
    }
}
