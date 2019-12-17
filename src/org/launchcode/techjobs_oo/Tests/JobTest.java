package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.CoreCompetency;

import static org.junit.Assert.*;


public class JobTest {
//    @Before
//    public void createJobObjects(){
//
//    }

    @Test
    public void testSettingJobId() {
        Job obj1 = new Job();
        Job obj2 = new Job();
        assertEquals(obj1.getId(), obj2.getId()-1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job fields = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue("Job is set correctly", fields instanceof Job);
        assertTrue("Employer is set correctly", fields.getEmployer() instanceof Employer);
        assertTrue("Location is set correctly", fields.getLocation() instanceof Location);
        assertTrue("PositionType is set correctly", fields.getPositionType() instanceof PositionType);
        assertTrue("CoreCompetency is set correctly", fields.getCoreCompetency() instanceof CoreCompetency);
        }

     @Test
    public void testJobsForEquality() {
        Job a1 = new Job();
         Job a2 = new Job();
         assertFalse(a1.equals(a2));
     }
    }
