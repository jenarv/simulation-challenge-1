import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

import java.util.Scanner;

public class OneShotAgent extends Agent {
    protected void setup() {
        System.out.println("Agent "+ getLocalName() + " started.");
        addBehaviour(new SimpleLinearRegresion());
    }

    private class SimpleLinearRegresion extends OneShotBehaviour {

        public void action() {
            try {
                Scanner scan = new Scanner(System.in);

                DataSet ds = new DataSet();
                Sumatoria sum = new Sumatoria();
                Algebra alg = new Algebra();
                SimpLinReg simp = new SimpLinReg();

                double n;

                sum.sumas(ds.getX(), ds.getY());
                alg.dt(ds.getX(), ds.getY());

                System.out.println("Beta 0 : " + simp.calculateIntersect(alg.getDTgen(), alg.getDTb0()));
                System.out.println("Beta 1 : " + simp.calculateSlope(alg.getDTgen(), alg.getDTb1()));
                simp.printRegEquation();

                int answer;
                do{
                    System.out.println("Enter the value of x to predict y: ");
                    n = scan.nextDouble();
                    System.out.println("y = " + simp.predict(n));
                    System.out.println("Do you want to calculate another value? Yes (1), No (0) ");
                    answer = scan.nextInt();
                }while(answer == 1);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        public int onEnd() {
            myAgent.doDelete();
            System.out.println("Agent "+ myAgent.getLocalName() + " ended.");
            return super.onEnd();
        }
    }    // END of inner class ...Behaviour
}
