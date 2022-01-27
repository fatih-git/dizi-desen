/**
 * @author fatih-git
 * */

public class Çiz {

    public static void main(String[] args) {

        String[][] ciz=new String[13][4];
        int count=0;
        int tur=-1;

        //j'nin 0 olduğu her yerde * olacak
        for (int i=0; i< ciz.length; i++){

            if (tur%2==0)
                count++;
            else if(tur%2!=-1)
                count--;

            for (int j=0; j<4; j++){

                if (count==j)
                    ciz[i][j]="*";
                else
                    ciz[i][j]="   ";

                if (j==0)
                    ciz[i][j]="*   ";

            }

            if (count==0 || count==3)
                tur++;

        }

        for (String[] row:ciz){

            for (String col:row)
                System.out.print(col);

            System.out.print("\n");

        }

    }

}
