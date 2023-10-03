package seminars.second.hw;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;

    @Before
    public void setCar() {
        car = new Car("Mazda", "CX-5", 2023);
    }

    @BeforeEach
    public void setMotorcycle() {
        motorcycle = new Motorcycle("Kawasaki", "NINJA H2R", 2021);
    }
    @Test
    public void testCarIsInstanceOfVehicle() {
        // Arrange
        setCar();
        // Act and assert
        assertTrue(car instanceof Vehicle);
    }
    @Test
    public void testCarHasFourWheels() {
        // Arrange
        setCar();
        // Act and assert
        assertEquals(car.getNumWheels(), 4);
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        // Arrange
        setMotorcycle();
        //Act and assert
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    public void CarSpeedTest() {
        // Arrange
        setCar();
        //Act
        car.testDrive();
        //Assert
        assertEquals(car.getSpeed(), 60);
    }

    @Test
    public void MotorcycleSpeedTest() {
        //Arrange
        setMotorcycle();
        //Act
        motorcycle.testDrive();
        //Assert
        assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    public void CarParkTest() {
        //Arrange
        setCar();
        //Act
        car.testDrive();
        car.park();
        // Assert
        assertEquals(car.getSpeed(), 0);
    }

    @Test
    public void MotorcycleParkTest() {
        //Arrange
        setMotorcycle();
        // Act
        motorcycle.testDrive();
        motorcycle.park();
        //Assert
        assertEquals(motorcycle.getSpeed(), 0);
    }
}