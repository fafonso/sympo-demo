<%@ include file="../init.jsp"%>

<%
	Promotion promotion =(Promotion) request.getAttribute("promotion");
	String redirect = request.getParameter("redirect");
	String title = (String) request.getAttribute("title");
	String description = "";
	String fullUserName = (String) request.getAttribute("fullUserName");
	renderResponse.setTitle(title);
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(redirect);
%>

<c:choose>
	<c:when test="${not empty promotion}">
		<portlet:actionURL var="promotionActionURL" name="/citytour/promotion/edit">
			<portlet:param name="redirect" value="${param.redirect}" />
		</portlet:actionURL>
	</c:when>
	<c:otherwise>
		<portlet:actionURL var="promotionActionURL" name="/citytour/promotion/add">
			<portlet:param name="redirect" value="${param.redirect}" />
		</portlet:actionURL>
	</c:otherwise>
</c:choose>


<aui:model-context bean="<%=promotion%>" model="<%=Promotion.class%>" />

<aui:form name="fm" action="${promotionActionURL}" cssClass="container-fluid-1280">
	<aui:input name="promotionId" field="promotionId" type="hidden" />
	<aui:fieldset-group markupView="lexicon">
		<aui:fieldset label="create.promotion.personal.data" cssClass="p-3">

			<c:choose>
				<c:when test="${not empty promotion} && ${not empty promotion.getOffereeFirstName()} && ${not empty promotion.getOffereeLastName()}">
					<aui:input name="offereeFirstName" label="create.promotion.offeree.firstname"/>
					<aui:input name="offereeLastName" label="create.promotion.offeree.lastname"/>
				</c:when>
				<c:otherwise>
						<aui:input name="offereeFirstName" label="create.promotion.offeree.firstname" value="${userFirstName}"/>
						<aui:input name="offereeLastName" label="create.promotion.offeree.lastname" value="${userLastName}"/>					
				</c:otherwise>
			</c:choose>

			<aui:input name="offereeIdNumber" label="create.promotion.offeree.idnumber"/>
			<aui:input name="offereeTelephone" label="create.promotion.offeree.telephone"/>
		</aui:fieldset>
	</aui:fieldset-group>
	<aui:fieldset-group markupView="lexicon">
		<aui:fieldset label="create.promotion.data" cssClass="p-3">
			<aui:input name="description" label="create.promotion.description"/>
			<aui:input name="price" label="create.promotion.price"/>
			<aui:input name="destinationCity" label="create.promotion.destinationcity"/>
		</aui:fieldset>
	</aui:fieldset-group>		
	<aui:button cssClass="btn-lg" type="submit" />
</aui:form>
