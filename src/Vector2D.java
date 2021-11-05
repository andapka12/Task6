public class Vector2D extends Vector {
    public Vector2D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2);

    }

    @Override
    public double getLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));// квадратный корень из суммы
        // квадратов его кооординат
    }

    @Override
    public String getVectorCords() {
        return (x2 - x1) + " " + (y2 - y1);
    }

    public double getScalarProduct(Vector2D vector2d) {    //Скалярное произведение векторов –
        // это произведение их длин на косинус угла между ними.
        String cords = getVectorCords();
        String cords2 = vector2d.getVectorCords();

        return Integer.parseInt(cords.split(" ")[0]) * Integer.parseInt(cords2.split(" ")[0]) +
                Integer.parseInt(cords2.split(" ")[1]) * Integer.parseInt(cords.split(" ")[1]);

    }

    //Косинус угла между векторами равен скалярному произведению векторов ,
// поделенному на произведение модулей векторов
    public double getAngle(Vector2D vector2d) {
        if (getLength() != 0 && vector2d.getLength() != 0) {
            return getScalarProduct(vector2d) / (this.getLength() * vector2d.getLength());
        } else return -2.0;
    }
}
