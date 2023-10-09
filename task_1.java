@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    int age = 19;
	// Напиши код здесь
    
    //public boolean checkIsAdult(int age ){
        assertEquals("Метод неверно определил категорию возраста",age > 18, isAdult );
    //}
        
}
