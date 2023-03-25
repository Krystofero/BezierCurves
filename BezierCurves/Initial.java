package BezierCurves;

public class Initial {

//    private int lw = 4; //liczba wierzcholkow dla jednej krzywej Beziera
//    private double[] tabk = new double[lw]; //wspolrzedne x jednego luku krzywej Beziera
//    private double[] yk = new double[lw]; //wspolrzedne y jednego luku krzywej Beziera
//
//    private int n = 10000; //liczba punktow do przeskakiwania dla jednego luku krzywej Beziera
//    private int lk; //liczba krzywych
//    private int[]xe = new int[lk*n]; //wspolrzedne ekranowe x punktow krzywej
//    private int[]ye = new int[lk*n]; //wspolrzedne ekranowe y punktow krzywej
//
//    private double[] tab1 = new double[lk*n]; //wspolrzedne rzeczywiste x punktow krzywej
//    private double[]y = new double[lk*n]; //wspolrzedne rzeczywiste y punktow krzywej
//
//    private double[] xb = new double[lk * lw];//wspolrzedne X wierzcholkow wszystkich wielobokow Bezier'a(lk*lw wspolrzednych)
//    private double[] yb = new double[lk * lw];//wspolrzedne Y wierzcholkow wszystkich wielobokow Bezier'a(lk*lw wspolrzednych)
//
//    Initial(int lk){
//        this.lk = lk;
//    }
//
//    public double[] zliczWspolrzedne(double []tab2){
//
//        double[] tab = tab2; //wspolrzedne X lub Y wierzcholkow wszystkich wielobokow Bezier'a(lk*lw wspolrzednych)
//        double[] yb = new double[lk * lw];//wspolrzedne Y wierzcholkow wszystkich wielobokow Bezier'a(lk*lw wspolrzednych)
//
//        int i, j, k, m, lzk, kk;
//        double t; //paramametr krzywej Beziera: 0 <= t <= 1
//
//        double sk = 1. / (n - 1);     //sk = o ile przeskakuje parametr t kazdego luku Beziera
//        for (k = 0, lzk = 0; lzk < lk; lzk++) //podroz po zlepianych krzywych
//        {
//            for (kk = 0, t = 0; kk < n; kk++, k++, t += sk) //zliczenie n punktow kazdej ze zlepianych krzywych
//            {
//                for (i = 0; i < lw; i++) {
//                    tabk[i] = tab[lw * lzk + i];
//                }
//                m = lw - 1;
//                for (i = 0; i < lw - 1; i++) {
//                    for (j = 0; j < m; j++) {
//                        tabk[j] = tabk[j] + t * (tabk[j + 1] - tabk[j]);
//                    }
//                    m--;
//                }
//                tab1[k] = tabk[0];
//            }
//        }
//        return tab1;
//    }

//    double[] xk2 = new double[lw]; //wspolrzedne x jednego luku krzywej Beziera
//    double[] yk2 = new double[lw]; //wspolrzedne y jednego luku krzywej Beziera
//
//    int lk2 = 6; //liczba krzywych
//    int[] xe2 = new int[lk2 *n]; //wspolrzedne ekranowe x punktow krzywej
//    int[] ye2 = new int[lk2 *n]; //wspolrzedne ekranowe y punktow krzywej
//
//    double[] x2 = new double[lk2 *n]; //wspolrzedne rzeczywiste x punktow krzywej
//    double[] y2 = new double[lk2 *n]; //wspolrzedne rzeczywiste y punktow krzywej
//
//    //Wspolrzedne - Litera O
////        ctx.moveTo(594 + xoff, 249 + yoff);
////        ctx.bezierCurveTo(596 + xoff, 127 + yoff, 592 + xoff, 99 + yoff, 558 + xoff, 72 + yoff);
////        ctx.bezierCurveTo(495 + xoff, 22 + yoff, 418 + xoff, 59 + yoff, 407 + xoff, 76 + yoff);
////        ctx.bezierCurveTo(365 + xoff, 142 + yoff, 374 + xoff, 232 + yoff, 374 + xoff, 247 + yoff);
////        ctx.bezierCurveTo(378 + xoff, 425 + yoff, 397 + xoff, 431 + yoff, 423 + xoff, 453 + yoff);
////        ctx.bezierCurveTo(450 + xoff, 476 + yoff, 527 + xoff, 483 + yoff, 571 + xoff, 440 + yoff);
////        ctx.bezierCurveTo(599 + xoff, 413 + yoff, 597 + xoff, 231 + yoff, 594 + xoff, 250 + yoff);
//
//    double[] xb2 = {594,596,592,558,
//            558,495,418,407,
//            407,365,374,374,
//            374,378,397,423,
//            423,450,527,571,
//            571,599,597,594}; //wspolrzedne X wierzcholkow wszystkich wielobokow Bezier'a(lk*lw wspolrzednych)
//    double[] yb2 = {249,127,99,72,
//            72,22,59,76,
//            76,142,232,247,
//            247,425,431,453,
//            453,476,483,440,
//            440,413,231,249};//wspolrzedne Y wierzcholkow wszystkich wielobokow Bezier'a(lk*lw wspolrzednych)
//
//    int i,j,k,m,lzk,kk;
//    double t; //paramametr krzywej Beziera: 0 <= t <= 1
//
//    double sk=1./(n-1);     //sk = o ile przeskakuje parametr t kazdego luku Beziera
//        for(k=0,lzk=0;lzk<lk2;lzk++) //podroz po zlepianych krzywych
//    {
//        for(kk=0,t=0;kk<n;kk++,k++,t+=sk) //zliczenie n punktow kazdej ze zlepianych krzywych
//        {
//            for(i=0;i<lw;i++){
//                xk2[i]= xb2[lw*lzk+i]; yk2[i]= yb2[lw*lzk+i];}
//            m=lw-1;
//            for(i=0;i<lw-1;i++)
//            {
//                for(j=0;j<m;j++)
//                {
//                    xk2[j]= xk2[j]+t*(xk2[j+1]- xk2[j]);
//                    yk2[j]= yk2[j]+t*(yk2[j+1]- yk2[j]);
//                }
//                m--;
//            }
//            x2[k]= xk2[0];
//            y2[k]= yk2[0];
//        }
//    }
//
//    //dopasowanie zliczonych wspolrzednych do okna wizualizacji
//    ustawianie u1 = new ustawianie();
//    int[] row = {30,30,470,470};    //okno wizualizacji
//        u1.dopasowanie(k, this.getHeight(), x, y, row, xe, ye); //dopasowuję odpowiednie położenie inicjałów w oknie
//
//
//
//
}
