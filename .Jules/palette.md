## 2026-10-07 - JS Syntax Error in JSF Onclick Attributes
**Learning:** Single quotes inside inline JavaScript strings in JSF XHTML `onclick` attributes (e.g. `onclick="if(!confirm('l'etudiant'))"`) break JavaScript execution due to unescaped quotes. Phrasing as `cet etudiant` or properly escaping avoids runtime JS syntax errors without complex HTML entity escaping in XHTML attributes.
**Action:** Always check inline `onclick` confirm dialog strings for unescaped apostrophes in French texts and use phrasing without single quotes like `cet etudiant` or `ce element`.
