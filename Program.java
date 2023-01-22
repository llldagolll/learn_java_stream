public class Program {

    public static void main(String[] args) {
        Common stream = new Stream();
        Common conventional = new Conventional();

       Global.isEqual(
               Global.numbers,
               conventional::extractEvenNumbers,
                stream::extractEvenNumbers
        );

        Global.isEqual(
                Global.numbers,
                conventional::doubleListNumbers,
                stream::doubleListNumbers
        );

        Global.isEqual(
                Global.numbers,
                conventional::reverseOrder,
                stream::reverseOrder
        );
    }
}
