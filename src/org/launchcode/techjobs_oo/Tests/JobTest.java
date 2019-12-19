package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.w3c.dom.ls.LSOutput;

import static org.junit.Assert.*;


public class JobTest {
    private Job obj1;
    private Job obj2;
    private Job fields;
    private String blankToString;
    private String obj3;

    @Before
    public void makeVar() {
        obj1 = new Job();
        obj2 = new Job();
        fields = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        blankToString =
                " \n" +
                "ID: _______\n" +
                "Name: _______\n" +
                "Employer: _______\n" +
                "Location: _______\n" +
                "Position Type: _______\n" +
                "Core Competency: _______\n ";
        obj3 =" \n" +
                "ID: 12\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n ";
    }

    @Test
    public void testSettingJobId() {
        assertEquals(obj1.getId(), obj2.getId()-1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue("Job is set correctly", fields instanceof Job);
        assertTrue("Employer is set correctly", fields.getEmployer() instanceof Employer);
        assertTrue("Location is set correctly", fields.getLocation() instanceof Location);
        assertTrue("PositionType is set correctly", fields.getPositionType() instanceof PositionType);
        assertTrue("CoreCompetency is set correctly", fields.getCoreCompetency() instanceof CoreCompetency);
        }

     @Test
    public void testJobsForEquality() {
         assertFalse(obj1.equals(obj2));
     }

     @Test
    public void toStringBlankLine() {
        String[] lines = blankToString.toString().split("\n");
        assertTrue(lines[0].isBlank());
        assertTrue(lines[lines.length -1].isBlank());
    }


    @Test
    public void toStringLabelsAndData() {
//        System.out.println(obj3);
//        System.out.println(fields);
        assertTrue(obj3.equals(fields.toString()));
    }
}
