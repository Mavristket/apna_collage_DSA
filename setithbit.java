class setithbit{
    public static void main(String[] args) {
        int n = 10; // Example number
        int i = 2;  // Bit position to set (0-indexed)
        
        // Set the ith bit of n
        int result = n | (1 << i);
        
        System.out.println("Original number: " + n);
        System.out.println("Number after setting the " + i + "th bit: " + result);
    }
}