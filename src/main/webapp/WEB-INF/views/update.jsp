<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<form th:action="@{/save}"id=${accident.id}/> method="POST">
    <table>
        <tr>
            <td>Название:</td>
            <td><input type="text" name="text" value="${accident.name}"></td>
        </tr>
            <td colspan="2"><input name="submit" type="submit" value="Сохранить" /></td>
        </tr>
    </table>
</form>
</body>
</html>