import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleTest {

    @Test
    @DisplayName("Kiểm tra phép cộng cơ bản - Case thành công")
    void testAdditionSuccess() {
        System.out.println("Đang chạy: testAdditionSuccess");
        assertEquals(5, 2 + 3, "2 + 3 phải bằng 5");
    }

    @Test
    @DisplayName("Kiểm tra chuỗi rỗng - Case thành công")
    void testStringNotEmpty() {
        String data = "AgileTest Practice";
        assertFalse(data.isEmpty());
    }

    @Test
    @DisplayName("Ví dụ một Test Case thất bại (Fail)")
    void testSubtractionFail() {
        System.out.println("Đang chạy: testSubtractionFail");
        // Cố tình làm sai để kiểm tra cách hiển thị trên Jira
        assertEquals(10, 20 - 10);
    }

    @Test
    @DisplayName("Kiểm tra tính đúng đắn của logic - Case thành công")
    void testBooleanLogic() {
        boolean isLearningAgileTest = true;
        assertTrue(isLearningAgileTest, "Pass Test Case");
    }
}
