/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrolysis;

/**
 *
 * @author ASPIRE P2QG
 */
public class ChemCalculation {
    
    public double calculateMetalProduced(double current, double hours, double molarMass, int c, int electrons) {
        String[] metalsArr = {"Li", "K", "Ba", "Ca", "Na", "Mg", "Al", "Zn", "Cr", "Fe", "Co", "Ni", "Sn", "Pb", "Cu", "Hg", "Ag", "Au", "Pt", "Sr"};
        double[] molarMasss = {6.941, 39.098, 137.327, 40.078, 22.990, 24.305, 26.982, 65.409, 51.996, 55.845, 58.933, 58.693, 118.710, 207.2, 63.546, 200.592, 107.868, 196.967, 195.084, 87.62};
        int[] electronss = {1, 1, 2, 2, 1, 2, 3, 2, 3, 2, 2, 2, 2, 2, 2, 2, 1, 1, 2, 2};
        double metalProduced;
        metalProduced = current * (hours*3600) / 96485 * molarMasss[c] /electronss[c];
        return metalProduced;
    }
}
