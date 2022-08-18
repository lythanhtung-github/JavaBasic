import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    void checkTriangle() {
        int edge1 = 3;
        int edge2 = 4;
        int edge3 = 5;
        boolean result = TriangleClassifier.checkTriangle(edge1, edge2, edge3);

        assertTrue(result);
    }

    @Test
    void checkRightTriangle() {
        int edge1 = 3;
        int edge2 = 4;
        int edge3 = 5;
        boolean result = TriangleClassifier.checkRightTriangle(edge1, edge2, edge3);
        assertTrue(result);
    }

    @Test
    void triangleClassifier1() {
        int edge1 = 2;
        int edge2 = 2;
        int edge3 = 2;

        String result = TriangleClassifier.triangleClassifier(edge1, edge2, edge3);
        String expected = "Tam giác đều";
        assertEquals(expected, result);
    }

    @Test
    void triangleClassifier2() {
        int edge1 = 2;
        int edge2 = 2;
        int edge3 = 3;

        String result = TriangleClassifier.triangleClassifier(edge1, edge2, edge3);
        String expected = "Tam giác cân";
        assertEquals(expected, result);
    }

    @Test
    void triangleClassifier3() {
        int edge1 = 3;
        int edge2 = 4;
        int edge3 = 5;

        String result = TriangleClassifier.triangleClassifier(edge1, edge2, edge3);
        String expected = "Tam giác vuông";
        assertEquals(expected, result);
    }

    @Test
    void triangleClassifier4() {
        int edge1 = 8;
        int edge2 = 2;
        int edge3 = 3;

        String result = TriangleClassifier.triangleClassifier(edge1, edge2, edge3);
        String expected = "Không phải là tam giác";
        assertEquals(expected, result);
    }

    @Test
    void triangleClassifier5() {
        int edge1 = -1;
        int edge2 = 2;
        int edge3 = 1;

        String result = TriangleClassifier.triangleClassifier(edge1, edge2, edge3);
        String expected = "Không phải là tam giác";
        assertEquals(expected, result);
    }

    @Test
    void triangleClassifier6() {
        int edge1 = 0;
        int edge2 = 1;
        int edge3 = 1;

        String result = TriangleClassifier.triangleClassifier(edge1, edge2, edge3);
        String expected = "Không phải là tam giác";
        assertEquals(expected, result);
    }
}