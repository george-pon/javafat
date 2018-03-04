<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello Page</title>
</head>
<script language="JavaScript">
<!--
	var timer2 = null;
	function mysubmit() {
		if (timer2 != null) {
			clearTimeout(timer2);
			timer2 = null;
		}
		document.mpsform.submit();
	}
	function tm() {
		timer2 = setTimeout(mysubmit, 5 * 1000);
	}
//-->
</script>
<body onLoad="tm()">
	<h2>javafat - memory use</h2>
	<p>５秒ごとに自動でリロード。消費メモリが増えていく。</p>
	<form method="post" name="mpsform" action="mps">
		<table>
			<tr>
				<td>memory use (mega bytes) per count:</td>
				<td><input type="text" id="mps-text-input" name="mps"
					value="${mps}" /></td>
			</tr>
			<tr>
				<td>count:</td>
				<td><input type="text" id="count-text-input" name="count"
					value="${count}" readonly /></td>
			</tr>
			<tr>
				<td>memory total use sum:</td>
				<td><input type="text" id="sum-text-input" name="sum"
					value="${sum}" readonly /></td>
			</tr>
			<tr>
				<td><input type="submit" id="mpsnextbutton" value="Next" /></td>
				<td></td>
			</tr>
		</table>
	</form>
</body>
</html>
