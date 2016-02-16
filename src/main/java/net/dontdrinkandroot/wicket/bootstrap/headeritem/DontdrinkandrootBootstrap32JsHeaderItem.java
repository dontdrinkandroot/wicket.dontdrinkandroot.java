package net.dontdrinkandroot.wicket.bootstrap.headeritem;

import java.util.Collections;
import java.util.List;

import org.apache.wicket.ajax.WicketEventJQueryResourceReference;
import org.apache.wicket.markup.head.HeaderItem;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.head.JavaScriptUrlReferenceHeaderItem;


public class DontdrinkandrootBootstrap32JsHeaderItem extends JavaScriptUrlReferenceHeaderItem
{

	public DontdrinkandrootBootstrap32JsHeaderItem(boolean defer)
	{
		super(
				"http://static.dontdrinkandroot.net/bootstrap/3.2/bootstrap.min.js",
				"bootstrap-3.1.js",
				defer,
				null,
				null);
	}

	@Override
	public List<HeaderItem> getDependencies()
	{
		final HeaderItem jQuery = JavaScriptHeaderItem.forReference(WicketEventJQueryResourceReference.get());

		return Collections.singletonList(jQuery);
	}
}