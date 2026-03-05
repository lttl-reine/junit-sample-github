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
        assertEquals(10, 20 - 5, "Kết quả mong đợi là 15 nhưng assertion này sẽ fail");
    }

    @Test
    @DisplayName("Ví dụ một Test Case gây ra lỗi (Error)")
    void testRuntimeError() {
        System.out.println("Đang chạy: testRuntimeError");
        // Gây ra lỗi chia cho 0 để tạo trạng thái 'Error' thay vì 'Fail'
        int result = 10 / 0;
    }

    @Test
    @DisplayName("Kiểm tra tính đúng đắn của logic - Case thành công")
    void testBooleanLogic() {
        boolean isLearningAgileTest = true;
        assertTrue(isLearningAgileTest, "Linh đang học AgileTest rất tốt!");
    }
}
