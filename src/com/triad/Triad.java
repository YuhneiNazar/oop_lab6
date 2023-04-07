package com.triad;
import java.util.Scanner;
public class Triad {
    private int x;
    private int y;
    private int z;

    public int getx(){return this.x;}
    public int gety(){return this.y;}
    public int getz(){return this.z;}
    public boolean setx(int x) {
        if (x > 0)
        {
            this.x = x;
            return true;
        }
        else
        {
            this.x = 0;
            return false;
        }
    }

    public boolean sety(int y) {
        if (y > 0)
        {
            this.y = y;
            return true;
        }
        else
        {
            this.y = 0;
            return false;
        }
    }
    public boolean setz(int z) {
        if (z > 0)
        {
            this.z = z;
            return true;
        }
        else
        {
            this.z = 0;
            return false;
        }
    }
    public boolean Init( int x, int y, int z)
    {
        return setx(x) && sety(y) && setz(z);
    }

        public String ToString() {
            return "Triad: [x =: " + this.x + ", "
                    + "y=: " + this.y +", "+"z=:"+this.z + "]";
        }
    public void plus(int num) {
        x += num;
        y += num;
        z += num;
    }

    public void mnoh(int num) {
        x *= num;
        y *= num;
        z *= num;
    }

    public boolean equals(int num) {return (this.x == num) || (this.y == num) || (this.z == num);}
        public void Read()
        { Scanner scan = new Scanner(System.in);

            int x,y,z;
            do
            {
                System.out.println("Введіть x: ");
                x = scan.nextInt();
                System.out.println("Введіть y");
                y= scan.nextInt();
                System.out.println("Введіть z");
                z = scan.nextInt();
            } while (!Init(x,y,z));
        }

        public void  Display ()
        {
           System.out.println("X ="+this.x);
            System.out.println("Y ="+this.y);
            System.out.println("Z ="+this.z);
        }

        public void Aroper (int num) {
        int x2 = this.x;
        int y2 = this.y;
        int z2 = this.z;
        System.out.println("Додавання числа:");
        plus(num);
        Display();
        setx(x2);
        sety(y2);
        setz(z2);
        System.out.println("Множення на число:");
            mnoh(num);
            Display();
            setx(x2);
            sety(y2);
            setz(z2);
            System.out.println("Превірка на рівність: "+equals(num));
        }

    public static class Vector3D {
        private Triad triad;

        public Vector3D(Triad triad) {
            this.triad = triad;
        }

        public void add(Vector3D other) {
            this.triad.setx(this.triad.getx() + other.triad.x);
            this.triad.sety(this.triad.gety() + other.triad.y);
            this.triad.setz(this.triad.getz() + other.triad.z);
        }

        public int dotProduct(Vector3D other) {
            return this.triad.x * other.triad.x + this.triad.y * other.triad.y + this.triad.z * other.triad.z;
        }

        public String ToString() {
            return "Vector3D: [x =: " + this.triad.x + ", "
                    + "y=: " + this.triad.y +", "+"z=:"+this.triad.z + "]";
        }
    }
}
