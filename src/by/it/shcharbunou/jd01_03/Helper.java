package by.it.shcharbunou.jd01_03;

public class Helper {

    /**
     * a method that looks for the minimum element in an array
     * @param array array of double type
     * @return returns the minimum element of an array
     */
    protected static double findMin(double[] array) {
        double minValue = Double.MAX_VALUE;
        for (double element : array) {
            if (minValue > element) {
                minValue = element;
            }
        }
        return minValue;
    }

    /**
     * a method that looks for the maximum element in an array
     * @param array array of double type
     * @return returns the maximum element of an array
     */
    protected static double findMax(double[] array) {
        double maxValue = Double.MIN_VALUE;
        for (double element : array) {
            if (maxValue < element) {
                maxValue = element;
            }
        }
        return maxValue;
    }

    /**
     * sort array by bubble
     * @param array array of double type
     */
    protected static void sort(double[] array) {
        boolean isSwapped;
        int lastElement = array.length - 1;
        do {
            isSwapped = false;
            for (int i = 0; i < lastElement; i++) {
                if (array[i] > array[i + 1]) {
                    double buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                    isSwapped = true;
                }
            }
            lastElement--;
        } while (isSwapped);
    }

    /**
     * matrix-matrix multiplication method
     * @param matrixLeft first matrix
     * @param matrixRight second matrix
     * @return returns the result of multiplying two matrices
     */
    protected static double[][] multiply(double[][] matrixLeft, double[][] matrixRight) {
        double[][] multipliedMatrix;
        if (matrixLeft.length != 0 && matrixLeft[0].length != 0) {
            multipliedMatrix = new double[matrixLeft.length][matrixRight[0].length];
        } else {
            System.out.println("Error: Empty matrix.");
            return new double[0][0];
        }
        if (!(matrixLeft[0].length == matrixRight.length)) {
            System.out.println("Error: count of first matrix columns must be count of second matrix rows.");
            return multipliedMatrix;
        }
        for (int i = 0; i < matrixLeft.length; i++) {
            for (int j = 0; j < matrixRight[i].length; j++) {
                for (int k = 0; k < matrixRight.length; k++) {
                    multipliedMatrix[i][j] = multipliedMatrix[i][j] + matrixLeft[i][k] * matrixRight[k][j];
                }
            }
        }
        return multipliedMatrix;
    }

    /**
     * matrix-vector multiplication method
     * @param matrix matrix
     * @param vector vector
     * @return returns the result of multiplying a matrix by a vector
     */
    protected static double[] multiply(double[][] matrix, double[] vector) {
        double[] multipliedVector;
        if (matrix.length != 0) {
            multipliedVector = new double[matrix.length];
        } else {
            System.out.println("Error: Empty matrix.");
            return new double[0];
        }
        if (vector.length != matrix[0].length) {
            System.out.println("Error: Vector must be the same length.");
            return new double[0];
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                multipliedVector[i] = multipliedVector[i] + matrix[i][j] * vector[j];
            }
        }
        return multipliedVector;
    }
}