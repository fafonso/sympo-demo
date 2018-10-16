<%@ include file="../init.jsp"%>
<%
	ResultRow row = (ResultRow) request.getAttribute(
		WebKeys.SEARCH_CONTAINER_RESULT_ROW);

	Promocion promocion = (Promocion) row.getObject();
	String promocionId =
		StringUtil.valueOf(promocion.getPromocionId());

%>

<liferay-ui:icon-menu markupView="lexicon" showWhenSingleIcon="true">
		<portlet:actionURL name="/citytour/promocion/delete"
			var="deletePromocionURL">
			<portlet:param name="redirect" value="${currentURL}" />
			<portlet:param name="promocionId" value="${SEARCH_CONTAINER_RESULT_ROW.object.promocionId}" />
		</portlet:actionURL>

		<liferay-ui:icon-delete url="${deletePromocionURL}" label="promocion.borrar"/>

</liferay-ui:icon-menu> 