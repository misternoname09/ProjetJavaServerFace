## 2025-05-18 - Avoiding apostrophes in inline JS confirm dialogs in JSF

**Learning:** In JSF/Facelets components, writing inline JavaScript in XML attributes such as `onclick="if(! confirm('... l'etudiant')) return false;"` causes syntax errors due to unescaped single quotes inside single-quoted JS strings. Standard XML entities like `&#39;` or escaping can be problematic or awkward across different JSF renderers.
**Action:** Phrasing French dialog text using 'cet étudiant' instead of 'l\'étudiant' completely circumvents single-quote escaping issues, producing valid JavaScript execution while providing clear and professional UI copy.
