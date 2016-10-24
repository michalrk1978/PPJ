package zadanie3s78;

import java.io.IOException;

public class Matrix {
    private double[][] matrix;

    public Matrix() {
    }
    
    public double[][] getMatrix() {
        return matrix;
    }
    
    public void setMatrix(double[][] sMatrix){
        matrix = sMatrix;
    }

    public Matrix(double[][] m) {
        matrix = m;
    }

    public Matrix(Matrix sMatrix) {
        matrix = sMatrix.getMatrix();
    }

    public Matrix add(Matrix sMatrix) throws IOException {

        int n1 = matrix.length;
        int n2 = sMatrix.getMatrix().length;

        int m1 = matrix[0].length;
        int m2 = sMatrix.getMatrix()[0].length;

        if (n1 != n2 || m1 != m2) {
            throw new IOException("rozmiary macierzy nie zgadzaja sie");
        } else {
            double[][] wynik = new double[n1][m1];
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++) {
                    wynik[i][j] = matrix[i][j] + sMatrix.getMatrix()[i][j];
                }
            }
            return new Matrix(wynik);
        }

    }

    public Matrix mul(double skalar) {

        int n = matrix.length;
        int m = matrix[0].length;
        
        double[][] wynik = new double[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                wynik[i][j] = matrix[i][j] * skalar;
            }
        return new Matrix(wynik);

    }

    public Matrix sub(Matrix sMatrix) throws IOException {
        int n1 = matrix.length;
        int n2 = sMatrix.getMatrix().length;

        int m1 = matrix[0].length;
        int m2 = sMatrix.getMatrix()[0].length;
        
        

        if (n1 != n2 || m1 != m2) {
            throw new IOException("rozmiary macierzy nie zgadzaja sie");
        } else {
            double[][] wynik = new double[n1][m1];
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++) {
                    wynik[i][j] = matrix[i][j] - sMatrix.getMatrix()[i][j];
                }
            }
            return new Matrix(wynik);
        }

    }

    public Matrix mul(Matrix sMatrix) throws IOException {

        int l = matrix.length;
        int m1 = matrix[0].length;
        int m2 = sMatrix.getMatrix().length;
        int n = sMatrix.getMatrix()[0].length;

        double suma = 0;
        
       

        if (m1 != m2) {
            throw new IOException("ilosc kolumn pierwszej macierzy rozni sie od ilosci wierszy drugiej");
        } else {
            double[][] wynik = new double[l][n];
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < n; j++) {
                    suma = 0;
                    for (int k = 0; k < m1; k++) {
                        suma += matrix[i][k] * sMatrix.getMatrix()[k][j];
                    }
                    wynik[i][j] = suma;
                }
            }
            return new Matrix(wynik);
        }
        
    }

    public double[] sumaWierszowa() {

        int m = matrix.length;
        int n = matrix[0].length;

        double[] sumaWierszy = new double[m];
        double suma = 0;


        for (int i = 0; i < m; i++) {
            suma = 0;
            for (int j = 0; j < n; j++) {
                suma += matrix[i][j];
            }
            sumaWierszy[i] = suma;
        }
        return sumaWierszy;
    }
    
    public double[] sumaKolumnowa() {
        int m = matrix.length;
        int n = matrix[0].length;

        double[] sumaKolumn = new double[n];
        double suma = 0;
        
        for (int j = 0; j < n; j++) {
            suma = 0;
            for (int i = 0; i < m; i++) {
                suma += matrix[i][j];
            }
            sumaKolumn[j] = suma;
        }
        return sumaKolumn;
    }

    public double calkowitaSuma() {
        int m = matrix.length;
        int n = matrix[0].length;

        double suma = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                suma += matrix[i][j];
            }
        }
        return suma;
    }
    
    public String toString() {
        int m = matrix.length;
        int n = matrix[0].length;
        String wynik = "";
        
        for (int i = 0; i < m; i++) {
           for (int j = 0; j < n; j++) {
                wynik += matrix[i][j] + "  ";
            }
            wynik += "\n";
        }
        return wynik;
    }


}
