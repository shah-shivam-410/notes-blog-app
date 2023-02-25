<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />

<title>Blog</title>
</head>

<body>
	<div class="container">

		<div class="text-center content">
			<h2>Add a note</h2>
			<form action="addnote" method="post">
			
				<input type="text" name="title" id="title" placeholder="Title">
				<textarea rows="5" cols="33" name="description" id="description" placeholder="Description"></textarea>
				<button type="submit" name="submit" id="submit">Submit</button>
			
			</form>
		</div>

		<div class="text-center content">
			<h2>All Notes:</h2>
			<ul>
				<c:forEach items="${notes}" var="note">
					<li>${note.title}</li>
				</c:forEach>
			</ul>
		</div>
	</div>


</body>

</html>