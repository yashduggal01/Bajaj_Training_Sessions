class Water_and_Jug_Problem {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if (targetCapacity > jug1Capacity + jug2Capacity) {
            return false;
        }
        if (jug1Capacity == 0 && jug2Capacity == 0) {
            return targetCapacity == 0;
        }
        
        // Using GCD: volumes that can be measured are multiples of GCD
        int gcd = gcd(jug1Capacity, jug2Capacity);
        return targetCapacity % gcd == 0;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
