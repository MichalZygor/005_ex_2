public class SetTemperatureInRoom {
    public static void main(String[] args) {
        Room room = new Room(21.5, 2.6, 2.5, true);
        System.out.println("Obniżamy temperaturę o 1st. 'true' jeżeli jest klimatyzator i jeżeli nie osiągnięto "
                + "granicznej temperatury. Objętość pokoju to: " + room.volume() + "m^3");
        System.out.print("Temperatura przed obniżeniem: " +room.getAmbientTemperatureC() );
        System.out.print(". Status: "+ room.oneDegreeDown());
        System.out.println(". Temperatura po obniżeniu: " +room.getAmbientTemperatureC());

        System.out.print("Temperatura przed obniżeniem: " +room.getAmbientTemperatureC() );
        System.out.print(". Status: "+ room.oneDegreeDown());
        System.out.println(". Temperatura po obniżeniu: " +room.getAmbientTemperatureC());

        System.out.print("Temperatura przed obniżeniem: " +room.getAmbientTemperatureC() );
        System.out.print(". Status: "+ room.oneDegreeDown());
        System.out.println(". Temperatura po obniżeniu: " +room.getAmbientTemperatureC());

        System.out.print("Temperatura przed obniżeniem: " +room.getAmbientTemperatureC() );
        System.out.print(". Status: "+ room.oneDegreeDown());
        System.out.println(". Temperatura po obniżeniu: " +room.getAmbientTemperatureC());

        System.out.print("Temperatura przed obniżeniem: " +room.getAmbientTemperatureC() );
        System.out.print(". Status: "+ room.oneDegreeDown());
        System.out.println(". Temperatura po obniżeniu: " +room.getAmbientTemperatureC());

        System.out.print("Temperatura przed obniżeniem: " +room.getAmbientTemperatureC() );
        System.out.print(". Status: "+ room.oneDegreeDown());
        System.out.println(". Temperatura po obniżeniu: " +room.getAmbientTemperatureC());


    }
}
