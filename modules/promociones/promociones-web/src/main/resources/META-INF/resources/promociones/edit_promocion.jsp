<%@ include file="../init.jsp"%>

<%
	Promocion promocion =(Promocion) request.getAttribute("promocion");
	String redirect = request.getParameter("redirect");
	String title = (String) request.getAttribute("title");
	String description = "";
	String fullUserName = (String) request.getAttribute("fullUserName");
	renderResponse.setTitle(title);
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(redirect);
%>

<c:choose>
	<c:when test="${not empty promocion}">
		<portlet:actionURL var="promocionActionURL" name="/citytour/promocion/edit">
			<portlet:param name="redirect" value="${param.redirect}" />
		</portlet:actionURL>
	</c:when>
	<c:otherwise>
		<portlet:actionURL var="promocionActionURL" name="/citytour/promocion/add">
			<portlet:param name="redirect" value="${param.redirect}" />
		</portlet:actionURL>
	</c:otherwise>
</c:choose>


<aui:model-context bean="<%=promocion%>" model="<%=Promocion.class%>" />

<aui:form name="fm" action="${promocionActionURL}" cssClass="container-fluid-1280">
	<aui:input name="promocionId" field="promocionId" type="hidden" />
	<aui:fieldset-group markupView="lexicon">
		<aui:fieldset label="create.promocion.datos.personales" cssClass="p-3">

			<c:choose>
				<c:when test="${not empty promocion} && ${not empty promocion.getNombreDestinatario()} && ${not empty promocion.getApellidosDestinatario()}">
					<aui:input name="nombreDestinatario" label="create.promocion.nombre.destinatario"/>
					<aui:input name="apellidosDestinatario" label="create.promocion.apellidos.destinatario"/>
				</c:when>
				<c:otherwise>
						<aui:input name="nombreDestinatario" label="create.promocion.nombre.destinatario" value="${userFirstName}"/>
						<aui:input name="apellidosDestinatario" label="create.promocion.apellidos.destinatario" value="${userLastName}"/>					
				</c:otherwise>
			</c:choose>

			<aui:input name="nifDestinatario" label="create.promocion.nif.destinatario"/>
			<aui:input name="telefonoDestinatario" label="create.promocion.telefono.destinatario"/>
		</aui:fieldset>
	</aui:fieldset-group>
	<aui:fieldset-group markupView="lexicon">
		<aui:fieldset label="create.promocion.datos.promocion" cssClass="p-3">
			<aui:input name="descripcion" label="create.promocion.descripcion"/>
			<aui:input name="precio" label="create.promocion.precio"/>
			<aui:input name="ciudadDestino" label="create.promocion.ciudadDestino"/>
		</aui:fieldset>
	</aui:fieldset-group>		
	<aui:button cssClass="btn-lg" type="submit" />
</aui:form>
