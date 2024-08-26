class Worker { }
class Designer { }
class HWorker extends Worker { }
class SWorker extends Worker { }
class WSWorker extends SWorker { }
class ADesigner extends Designer { }

public class TestGetClass {
    public static void main(String[] args) {
        Worker worker = new Worker();
        HWorker hworker = new HWorker();
        SWorker sworker1 = new SWorker();
        SWorker sworker2 = new SWorker();
        WSWorker wsworker = new WSWorker();
        Designer designer = new Designer();
        ADesigner adesigner = new ADesigner();

        System.out.println(worker.getClass() == hworker.getClass()); // false
        System.out.println(sworker1.getClass() == sworker2.getClass()); // true
        System.out.println(sworker1.getClass() == wsworker.getClass()); // false
        //The following is ERROR! No ancestor-descendant relationship
        //System.out.println(hworker.getClass() == designer.getClass());

        System.out.println(wsworker instanceof Worker); // true
        System.out.println(sworker1 instanceof WSWorker); // false
        System.out.println(designer instanceof Object); // true
        // The following is ERROR: No ancestor-descendant relationship
        // System.out.println(worker instanceof Designer);
    }
}


