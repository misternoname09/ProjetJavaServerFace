## 2025-05-14 - JSF & PrimeFaces Accessibility and Pitfalls
**Learning:** In legacy JSF projects, UI components often fail silently due to case-sensitive Expression Language (EL) method references and improperly nested `<h:form>` tags. Accessibility is also frequently overlooked, requiring manual `id`/`for` associations for `p:outputLabel` to work with screen readers.
**Action:** Always verify EL method names against Java source code (case matters!) and ensure each interactive section is wrapped in exactly one non-nested `<h:form>`. Always use `id` and `for` on labels and inputs.

## 2025-05-14 - JavaScript Escaping in JSF Attributes
**Learning:** Using single quotes in JavaScript strings within JSF attributes (like `onclick`) will break the page if the text contains apostrophes (common in French, e.g., "l'etudiant").
**Action:** Always escape single quotes (`\'`) in JavaScript strings within XHTML attributes to prevent syntax errors that disable button functionality.
