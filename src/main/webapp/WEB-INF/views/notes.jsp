<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />

<style type="text/css">
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
	/* margin: auto; */
	padding: auto;
	padding-left: 30px;
	padding-right: 30px;
	padding-left: 30px;;
}

.shownotes
,
{
margin


:

 

auto


;
padding


:


auto
;


}
#title {
	margin-bottom: 5px;
}
</style>

<title>Blog</title>
</head>

<body>
	<div class="container">
		<div class="addnote">
			<h2>Add a note</h2>
			<form action="addnote" method="post">

				<input type="text" name="title" id="title" placeholder="Title"><br>
				<textarea class="my-2" rows="5" cols="33" name="description"
					id="description" placeholder="Description"></textarea>
				<br>
				<button class="" type="submit" name="submit" id="submit">Submit</button>

			</form>
		</div>
		<br>
		<hr>

		<div class="shownotes">
			<h2>All Notes:</h2>
			<table class="table" id="noteTable" style="">
				<thead class="thead-light">
					<tr>
						<th scope="col"><input type="checkbox" id="allNotes" /></th>
						<th scope="col">Title</th>
						<th scope="col">Description</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${notes}" var="note">
						<tr>
							<td><input class="note" type="checkbox" id="${note.id}" /></td>
							<td>${note.title}</td>
							<td>${note.description}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<br>

			<select id="drop1" data-dropdown-content class="f-dropdown"
				aria-hidden="true">
				<li><a href="#">This is a link</a></li>
				<li><a href="#">This is another</a></li>
				<li><a href="#">Yet another</a></li>
			</select>



		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>


	<script type="text/javascript">
		$(document).ready(function() {

			$('#allNotes').on('click', function() {
				//var elements = document.getElementsByClassName('note');
				//console.log(elements);
				$(".note").prop('checked', $(this).prop('checked'));
			})

		});
	</script>

</body>

</html>